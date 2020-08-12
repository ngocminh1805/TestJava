

public class Test{

    public static void main(String[] args) {

        // Tạo ra luồng myThread0 từ lớp MyThread       
        MyThread myThread0 = new MyThread();
        myThread0.start();  // kích hoạt luồng
         
        // Tạo ra luồng myThread1 từ lớp MyThread       
        MyThread myThread1 = new MyThread();
        myThread1.start();
         
        // Tạo ra luồng myThread2 từ lớp MyThread       
        MyThread myThread2 = new MyThread();
        myThread2.setName("Luồng 2");   // thay đổi tên luồng thành Luồng 2
        myThread2.start();

    }


}
