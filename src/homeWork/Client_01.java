package homeWork;

public class Client_01 {
    private String name;
    private String email;
    private String phoneNumber;
    // конструктор
    public Client_01(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    // геттеры и сеттеры
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    //метод для отображения информации о клиенте
    public void displayClientInfo(){
        System.out.println("Имя: " + name);
        System.out.println("email: " + email);
        System.out.println("телефон: " + phoneNumber);
    }

    public static void main(String[] args) {
        //создаем обьект клиента
        Client_01 client01 = new Client_01("Иванов Иван", "ivanov@example.com", "0176-226-01011");
        //отображаем информацию о клиенте
        client01.displayClientInfo();
    }
}
