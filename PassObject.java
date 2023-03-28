import java.util.Date;
import java.util.Scanner;

class Message {
    String msg;
    String id;
    Date date;
}

class View {
    void doLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your ID : ");
        String id = scanner.nextLine();

        System.out.println("Enter Your Password : ");
        String pwd = scanner.nextLine();

        DB db = new DB();
        // String msg = db.checkLogin(id, pwd);
        Message msg = db.checkLogin(id, pwd);
        System.out.println(msg.date);
        System.out.println(msg.id);
        System.out.println(msg.msg);
        scanner.close();
    }
}

class DB {
    Message checkLogin(String id, String pwd) {
        // String msg = "";
        Message msg = new Message();
        if(id.equals(pwd)) {
            msg.msg = "Login Success...";
        }
        else {
            msg.msg = "Login Failed...";
        }
        msg.id = id;
        msg.date = new Date();
        return msg;
    }
}

public class PassObject {
    public static void main(String[] args) {
        View view = new View();
        view.doLogin();
    }
}
