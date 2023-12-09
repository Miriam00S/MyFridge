import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private String name;
    private String code;
    private LocalDate expireDate;
    //imageIcon

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String code, String expireDate) {
        this.name = name;
        this.code = code;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.expireDate = LocalDate.parse(expireDate, formatter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
}
