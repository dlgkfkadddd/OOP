package model;

public class ProductDTO {
    private int pno;
    private String name;
    private String company;
    private int price;

    public ProductDTO(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String toString() {
        return "ProductDTO{pno=" + this.pno + ", name='" + this.name + "', company='" + this.company + "', price=" + this.price + "}";
    }

    public int getPno() {
        return this.pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}