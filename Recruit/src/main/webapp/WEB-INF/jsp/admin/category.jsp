<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	$(function () {
		var table = $("#categoryTable").DataTable({
			searching : false,
			lengthMenu : [ 10, 20, 50 ],
			serverSide : true,
			language : {
				lengthMenu : "_MENU_ 条记录每页",
				zeroRecords : "没有找到记录",
				info : "第 _PAGE_ 页 ( 总共 _PAGES_ 页 )",
				infoEmpty : "无记录",
				infoFiltered : "(从 _MAX_ 条记录过滤)",
				paginate : {
					previous : "上一页",
					next : "下一页"
				}
			},
			ajax : {
				url : "categoryList"
			},
			columns : [ {
				data : "name"
			}],
			columnDefs : [ {
				render : function(data, type, row) {
					return '<button class="btn btn-primary edit" data-id="'+row.id+'">编辑</button>'+
					'<button class="btn btn-primary find" data-id="'+row.id+'">查看子分类</button>'+
					'<button class="btn btn-primary del" data-id="'+row.id+'">删除</button>'
				},
				targets : 1
			} ]
		})
		$("#categoryTable").on("click","button.find",function(){
			var id=$(this).attr("data-id");
			table = $("#categoryTable").DataTable({
				searching : false,
				lengthMenu : [ 10, 20, 50 ],
				language : {
					lengthMenu : "_MENU_ 条记录每页",
					zeroRecords : "没有找到记录",
					info : "第 _PAGE_ 页 ( 总共 _PAGES_ 页 )",
					infoEmpty : "无记录",
					infoFiltered : "(从 _MAX_ 条记录过滤)",
					paginate : {
						previous : "上一页",
						next : "下一页"
					}
				},
				ajax : {
					url : "categoryList",
					data : function(param) {
						param.pid=id;
					}
				},
				columns : [ {
					data : "name"
				}],
				columnDefs : [ {
					render : function(data, type, row) {
						return '<button class="btn btn-primary edit" data-id="'+row.id+'">编辑</button>'+
						'<button class="btn btn-primary find" data-id="'+row.id+'">查看子分类</button>'+
						'<button class="btn btn-primary del" data-id="'+row.id+'">删除</button>'
					},
					targets : 1
				} ]
			})
		})
	})
</script>
<div>
	<input class="form-control" name="name" id="addName">
	<button type="button" id="addButton" class="btn btn-success">添加</button>
	<table id="categoryTable" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th width="25%">分类名称</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
</div>