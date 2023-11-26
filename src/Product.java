public class Product {
    private String name;
    private String code;
    private String expireDate; //data in calendar
    //imageIcon

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String code, String expireDate) {
        this.name = name;
        this.code = code;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
