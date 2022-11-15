/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlrp.utils;

import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HAN-PC
 */
public class poster extends Throwable{
    public static void RunSlide(JLabel slide) {
        File f = new File("");
        long count = 0;
        String duongdanBanner = "\\src\\main\\resources\\com\\qlrp\\image\\KHHome\\video poster";
        try ( Stream<Path> files = Files.list(Paths.get(f.getAbsolutePath() + duongdanBanner))) {
            count = files.count();
        } catch (IOException ex) {
            Logger.getLogger(poster.class.getName()).log(Level.SEVERE, null, ex);
        }
        int sl = (int) count;
        Thread slideThread = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        for (int i = 0; i < sl; i++) {
                            int a = i + 1;
                            slide.setIcon( new ImageIcon(f.getAbsolutePath() + duongdanBanner + "poster" + a + ".gif"));
                            sleep(3000);
                        } 
                    }
                } catch (Exception e) {
                }
            }
        };
        slideThread.start();
    }
    
//    public static void RunSlide(JPanel pnl, JLabel lbl) {
//        Thread slideThread = new Thread() {
//            @Override
//            public void run() {
//                try {
//                    while (true) {
//                        for (int i = 0; i < pnl.getComponentCount() - 6; i++) {
//                            for (int j = 0; j > -lbl.getWidth() - 50; j -= 4) {
//                                lbl.setLocation(j, 0);
//                                sleep(2);
//                                if (j <= -lbl.getWidth() - 30) {
//                                    slideThread.stop();
//                                }
//                            }
//                        }
//
//                    }
//                } catch (Exception e) {
//                }
//            }
//        };
//        slideThread.start();
//    }
}

