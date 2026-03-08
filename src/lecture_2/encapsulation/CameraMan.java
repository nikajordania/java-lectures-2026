package lecture_2.encapsulation;

public class CameraMan {
    public static void main(String[] args) {
        Camera camera = new Camera(100);

        // We can only get memory size, but cannot change it directly because it's private
        System.out.println(camera.getMemory());

        for (int i = 0; i < 11; i++) {
            camera.takePhoto();
        }

        System.out.println(camera.getMemory());
    }
}