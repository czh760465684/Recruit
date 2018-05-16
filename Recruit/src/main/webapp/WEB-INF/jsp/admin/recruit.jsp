<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
	#modal-table tr{
		margin-bottom:2px;
	}
	#selectdiv{
		margin:20px 0px;
	}
</style>
<script src="../static/js/recruit.js"></script>
<div>
	<div>
		<button type="button" id="addButton" class="btn btn-large btn-success">添加招聘信息</button>
	</div>
	<div id="selectdiv">
		<label for="exampleInputName2">课程名称：</label><input id="selname" >&nbsp;&nbsp;&nbsp;&nbsp;
		<label for="exampleInputName2">状态：</label><select id="selstate">
			<option>已发布</option>
			<option>已结束</option>		
		</select>&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="button" id="selbtn" class="btn btn-large btn-success">检索</button>
	</div>
	<table id="recruitTable" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th width="20%">职位名称</th>
				<th width="10%">分类</th>
				<th width="10%">公司</th>
				<th width="10%">工资</th>
				<th width="10%">需求文凭</th>
				<th width="10%">工作经验</th>
				<th width="20%">发布时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
	<div id="dialog" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">招聘信息编辑</h4>
				</div>
				<div class="modal-body">
					<form id="editForm">
							<input type="hidden" name="id" id="editId" value="0">
						<table id="modal-table">
							<tr>
								<td>职位名称：</td>
								<td><input class="form-control" name="name" id="editName"><label style="color:red;" id="nameErr"></label></td>
							</tr>
							<tr>
								<td>公司：</td>
								<td><input class="form-control" name="companyName" id="editCompanyName"><label style="color:red;" id="companyNameErr"></label></td>
							</tr>
							<tr id="tr_1">
								<td>&nbsp;</td>
								<td><button type="button" class="btn btn-primary" id="onEditCategory">取消修改分类</button></td>
							</tr>
							<tr id="tr_2">
								<td>所属一级分类：</td>
								<td><select class="span3" id="one">
									<option value="">请选择</option>
									<c:forEach var="c" items="${categoryList}">
										<option value="${c.id}">${c.name}</option>
									</c:forEach>
								</select></td>
							</tr>
							<tr id="tr_3">
								<td>所属二级分类：</td>
								<td><select class="span3" id="two">
								
								</select></td>
							</tr>
							<tr id="tr_4">
								<td>所属三级分类：</td>
								<td><select name="categoryId" id="three" class="span3">
									
								</select></td>
							</tr>
							<tr id="tr_5">
								<td>&nbsp;</td>
								<td><button type="button" class="btn btn-primary" id="editCategory">修改分类</button></td>
							</tr>
							<tr id="tr_6">
								<td>所属一级分类：</td>
								<td><input id="inputone" class="form-control" readonly="readonly"></td>
							</tr>
							<tr id="tr_7">
								<td>所属二级分类：</td>
								<td><input id="inputtwo" class="form-control" readonly="readonly"></td>
							</tr>
							<tr id="tr_8">
								<td>所属三级分类：</td>
								<td><input id="inputthree" class="form-control" readonly="readonly"></td>
							</tr>
							<tr>
								<td>职位描述：</td>
								<td><textarea class="form-control" rows="8" cols="40" name="detail" id="editDetail"></textarea></td>
							</tr>
							<tr>
								<td>职位诱惑：</td>
								<td><textarea class="form-control" rows="8" cols="40" name="tempt" id="editTempt"></textarea></td>								
							</tr>
							<tr>
								<td>工作城市：</td>
								<td><input class="form-control" name="address" id="editAddress"></td>
							</tr>
							<tr>
								<td>详细工作地址：</td>
								<td><input class="form-control" name="aredetailed" id="editAredetailed"></td>
							</tr>
							<tr>
								<td>工资：</td>
								<td><input class="form-control" name="salary" id="editSalary"> <label
									style="color: red;" id="priceErr"></label></td>
							</tr>
							<tr>
								<td>需求文凭：</td>
								<td><select name="diploma">
									<option>不限</option>
									<option>大专</option>
									<option>本科</option>
									<option>硕士</option>
									<option>博士</option>			
								</select></td>
							</tr>
							<tr>
								<td>工作经验：</td>
								<td><select name="work">
									<option>不限</option>
									<option>应届毕业生</option>
									<option>1年以下</option>
									<option>1-3年</option>
									<option>3-5年</option>
									<option>5-10年</option>
									<option>10年以上</option>	
								</select></td>
							</tr>
							<tr>
								<td>招聘状态：</td>
								<td><select name="state">
									<option>已发布</option>
									<option>已结束</option>
								</select></td>
							</tr>
						</table>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" id="save" class="btn btn-primary">保存</button>
				</div>
			</div>
		</div>
	</div>
</div>