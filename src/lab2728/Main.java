package lab2728;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main implements Runnable {

    public Main(){
        System.out.println("Новый поток создан");
    }

    public static void main(String[] args){
        Main main = new Main();
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);
        ArrayList<Thread> potoki = new ArrayList<>();
        for(int i=0;i<cores;i++){
            Thread potok = new Thread(main,String.valueOf(i));
            potoki.add(potok);
        }

        for(Thread potok: potoki){
            System.out.println(potok.getName());
            potok.start();
        }
    }

    public void resize(int x) throws IOException {
        int cores = Runtime.getRuntime().availableProcessors();
        String srcFolder = "C:\\Users\\gosha\\IdeaProjects\\JavaLab\\src\\lab2728\\images";
        String newsrcFolder = "C:\\Users\\gosha\\IdeaProjects\\JavaLab\\src\\lab2728\\new_images";

        File srcDir = new File(srcFolder);
        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();

        int avg_img_for_1_potok = files.length/cores;

        for(int i=x;i<avg_img_for_1_potok*(x+1);i++){
            File img = files[i];
            BufferedImage image = ImageIO.read(img);

            if(image == null){
                continue;
            }

            int newWidth = image.getWidth() / 2;
            int newHeight = (int) Math.round(
                    image.getHeight() / (image.getWidth() / (double) newWidth)
            );
            BufferedImage newImage = new BufferedImage(
                    newWidth, newHeight, BufferedImage.TYPE_INT_RGB
            );

            int widthStep = image.getWidth() / newWidth;
            int heightStep = image.getHeight() / newHeight;

            for (int n = 0; n < newWidth; n++)
            {
                for (int y = 0; y < newHeight; y++) {
                    int rgb = image.getRGB(n * widthStep, y * heightStep);
                    newImage.setRGB(n, y, rgb);
                }
            }

            File newFile = new File(newsrcFolder + "/" + img.getName());
            ImageIO.write(newImage, "jpg", newFile);
        }
        System.out.println("Duration: " + (System.currentTimeMillis() - start));
        //for()
    }

    @Override
    public void run() {
        try {
            resize(Integer.parseInt(Thread.currentThread().getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
