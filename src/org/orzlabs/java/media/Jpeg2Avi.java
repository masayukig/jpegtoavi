package org.orzlabs.java.media;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Jpeg2Avi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File outFile = new File("hoge.avi");
		try {
			AviWriter aviWriter = new AviWriter(outFile, 2, true);
			for (int i = 1; i < 5; i++) {
				BufferedImage bi =
					ImageIO.read(new File(
							"/home/igawa/Dropbox/Pictures/NEC_004" + i + ".JPG"));
				aviWriter.writeFrame(bi);
			}
			aviWriter.setFramesPerSecond(1, 1);
			aviWriter.setSamplesPerSecond(1);
			aviWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
