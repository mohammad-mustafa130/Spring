package six;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DaoDemo {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext("six");
        InputDataService ids = ctx.getBean(InputDataService.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter uid: ");
        ids.setUid(sc.nextInt());
        System.out.println("Enter first_name: ");
        ids.setFirstName(sc.next());
        System.out.println("Enter last_name: ");
        ids.setLastName(sc.next());
        System.out.println("Enter branch: ");
        ids.setBranch(sc.next());

        int uid = ids.getUid();
        String first_name = ids.getFirstName();
        String last_name = ids.getLastName();
        String branch = ids.getBranch();

        MyDao md = new MyDao();
        try {
            Connection con = md.doConnect();
            String query = "INSERT INTO DaoTable(uid, first_name, last_name, branch) VALUES(?,?,?,?)";

            PreparedStatement pst = md.getStatement(con, query);
            pst.setInt(1, uid);
            pst.setString(2, first_name);
            pst.setString(3, last_name);
            pst.setString(4, branch);

            md.storeData(pst);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
