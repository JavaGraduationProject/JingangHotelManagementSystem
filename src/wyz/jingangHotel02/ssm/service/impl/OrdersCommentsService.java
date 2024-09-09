package wyz.jingangHotel02.ssm.service.impl;

import java.util.List;

import wyz.jingangHotel02.ssm.autoPo.CommentsWithBLOBs;
import wyz.jingangHotel02.ssm.autoPo.OrdersComments;
import wyz.jingangHotel02.ssm.autoPo.OrdersCommentsVo;
import wyz.jingangHotel02.ssm.autoPo.UserCommemts;

public interface OrdersCommentsService {
	public List<CommentsWithBLOBs> selectUserComments(OrdersComments ordersComments);
	
	public List<UserCommemts> selectAllComments(OrdersComments ordersComments);
	
	public int selectCountAllComments(OrdersCommentsVo ordersCommentsVo);
	
	public List<UserCommemts> selectAllCommentsByPage(OrdersCommentsVo ordersCommentsVo);
	
	public int selectCountUserComments(OrdersCommentsVo ordersCommentsVo);
	
	public List<CommentsWithBLOBs> selectUserCommentsByPage(OrdersCommentsVo ordersCommentsVo);
}
