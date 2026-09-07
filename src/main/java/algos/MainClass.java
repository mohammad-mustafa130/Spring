package algos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext("algos");
        AlgosWrapper aw = ctx.getBean(AlgosWrapper.class);
        int[] arr = {20, 40, 50, 30, 10};

        aw.caller(arr);
        System.out.println("After sorting: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int res = aw.caller(arr, 30);
        if(res == -1) {
            System.out.println("Element not found");
        } else {
                System.out.println("Element found at index " + res);
        }
    }
}
