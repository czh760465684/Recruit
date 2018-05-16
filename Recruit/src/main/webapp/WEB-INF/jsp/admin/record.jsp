<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	$(function () {
		var table = $("#recordTable").DataTable({
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
				url : "recordList",
				data : function(param) {
					
				}
			},
			columns : [ {
				data : "seeker.name"
			},{
				data : "reruit.name"
			},{
				data : "sendDate"
			}],
			columnDefs : [ {
				render : function(data, type, row) {
					return '<button class="btn btn-primary edit" data-id="'+row.id+'">编辑</button>'+
					'<button class="btn btn-primary del" data-id="'+row.id+'">删除</button>'
				},
				targets : 3
			} ]
		})
	})
</script>
<div>
	<table id="recordTable" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th width="20%">求职者</th>
				<th width="25%">应聘职位</th>
				<th width="25%">应聘时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
</div>