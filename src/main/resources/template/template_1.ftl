<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>${hotelName?if_exists}</title>

<style text="text/css">
caption {
	font-size: 14px;
	font-weight: bold;
	margin-bottom:10px;
}
</style>

</head>

<body>
<table width="1000" cellpadding="0" cellspacing="5" border="0"  style="border: 1px solid;border-collapse: separate; border-spacing: 29px;">
		     <caption>
	           		酒店 房态变更通知
	         </caption>
	<tr>
		<td>
			<table cellpadding="0" cellspacing="5" border="0">
					<tbody>
						<tr>
							<td>酒店名称:</td>
							<td>${propNameZh?if_exists}</td>
						</tr>
						<tr>
							<td>基本信息：</td>
							<td></td>
						</tr>
						<tr>
							<td colspan="2">
								<table cellpadding="0" cellspacing="0" border="0" >
									<tr>
										<td>促销状态:</td>
										<td></td>
										<td>房价名称:</td>
										<td></td>
									</tr>
									<tr>
										<td>促销分类:</td>
										<td></td>
										<td>货币单位:</td>
										<td></td>
									</tr>
									<tr>
										<td>预订担保政策:</td>
										<td></td>
										<td>担保取消政策:</td>
										<td></td>
									</tr>
									<tr>
										<td>服务费/税金:</td>
										<td colspan="3"></td>
									</tr>
									<tr>
										<td>描述:</td>
										<td colspan="3"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td>预订限制</td>
							<td></td>
						</tr>
						 <tr>
							<td colspan="2">
								<table cellpadding="0" cellspacing="0" border="0" >
									<tr>
										<td>预订开始日期:</td>
										<td></td>
										<td>预订结束日期:</td>
										<td></td>
										<td>是否每日预订时间:</td>
										<td></td>
									</tr>
									<tr>
										<td>预订有效星期:</td>
										<td colspan="5"></td>
									</tr>
									<tr>
										<td>入住开始日期:</td>
										<td></td>
										<td>入住结束日期:</td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td>入住有效星期:</td>
										<td colspan="5"></td>
									</tr>
									<tr>
										<td>最小提前预订天数:</td>
										<td></td>
										<td>免费房天数：</td>
										<td colspan="3"></td>
									</tr>
										<tr>
										<td>最小连住天数:</td>
										<td></td>
										<td>最大连住天数：</td>
										<td></td>
										<td></td>
										<td></td>
									</tr>
								</table>
							</td>
						</tr>
					</tbody>
			</table>
		</td>
	</tr>
	<tr>
		<td>
			<table  cellpadding="0" cellspacing="5" border="0" style="text-align:right;margin-left: 740px;">
		        <!-- 水平居中的邮件 -->
					<tbody>
						<tr>
							<td>更新日期:</td>
							<td>${.now}</td>
						</tr>
						<tr>
							<td colspan="2">锦江酒店预订中心</td>
						</tr>
						<tr>
							<td>电话:</td>
							<td>86-21-53559576</td>
						</tr>
						<tr>
							<td>预订传真:</td>
							<td>86-21-53700638</td>
						</tr>
					</tbody>
			</table>
		</td>
	</tr>
	
</table>

</body>
</html>