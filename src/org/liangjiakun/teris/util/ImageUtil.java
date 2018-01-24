package org.liangjiakun.teris.util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.liangjiakun.teris.exception.GameException;
import org.liangjiakun.teris.object.Piece;
import org.liangjiakun.teris.object.Square;

public class ImageUtil {
	public static BufferedImage getImage(String imagePath) {
    	try {
    		// 使用ImageIO读取图片
    		return ImageIO.read(new File(imagePath));
    	} catch (IOException e) {
    		// 读取图片发生异常，抛出GameException
    		throw new GameException("read image error");
    	}
	}
	
	/**
	 * 在界面上画一个Piece对象
	 * @param g
	 * @param piece
	 */
	public static void paintPiece(Graphics g, Piece piece) {
		if (piece == null) return;
		for (int i = 0; i < piece.getSquares().size(); i++) {
			Square s = piece.getSquares().get(i);
			g.drawImage(s.getImage(), s.getBeginX(), s.getBeginY(), null);
		}
	}
}
