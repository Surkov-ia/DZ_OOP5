package Data;

public class Authomat implements IAuthomat {
    private String vid;
    private String productType;
    private String name;

    public Authomat(String vid, String productType, String name) {
        this.vid = vid;
        this.productType = productType;
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    @Override
    public String toString() {
        return "Authomat{" +
                "vid='" + vid + '\'' +
                ", productType='" + productType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void initProduct() {

    }

    @Override
    public String getProduct() {
        return null;
    }
}
