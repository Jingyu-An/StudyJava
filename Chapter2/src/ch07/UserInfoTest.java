package ch07;

public class UserInfoTest {

    public static void main(String[] args) {

        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassWord = "zasdf123";
        userLee.userName = "Lee";
        userLee.phoneNumber = "444444444";
        userLee.userAddress = "Montreal";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b1111", "1231111aaa", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}
