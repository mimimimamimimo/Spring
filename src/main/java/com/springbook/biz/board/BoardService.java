package com.springbook.biz.board;

import java.util.List;

public interface BoardService {//�� �������̽��� BoardDAO���� ����(shft+alt+T)�� ���̴�. ������ ���� BoardDAO�� �� �������̽��� ��ӹ��� �ʴ´�.
	                           //why?dao�� Board���� �����ؼ� ���°� �ƴѱ� ������ ���������� �����ؾ� �Ѵ�

	void insertBoard(BoardVO vo);    //��ȣ �ּ��� ���� ����ǳ�~~
    
	//�� ����
	void updatetBoard(BoardVO vo);

	//�� ����
	void deleteBoard(BoardVO vo);

	//�� ����ȸ
	BoardVO getBoard(BoardVO vo);

	//�۸����ȸ
	List<BoardVO> getBoardList(BoardVO vo);

}