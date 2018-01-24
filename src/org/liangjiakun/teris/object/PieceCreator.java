package org.liangjiakun.teris.object;

public interface PieceCreator {
	/**
	 * ��x��y�����д���һ��Square����
	 * @return
	 */
	Piece createPiece(int x, int y);
	
	/**
	 * ����һ��Square����
	 * @return
	 */
	Piece getPiece();
}