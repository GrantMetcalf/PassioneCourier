package com.PassioneCourier.group2.Entity.unlabeled;

import java.io.Serializable;

public class Product implements Serializable {

    private int product_ID;
    private String product_name, product_description, product_type;

    private Product(){}

    private Product(Builder builder) {
        this.product_ID = builder.product_ID;
        this.product_name = builder.product_name;
        this.product_description = builder.product_description;
        this.product_type = builder.product_type;
    }

    public int getProduct_ID() {
        return product_ID;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public String getProduct_type() {
        return product_type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_ID=" + product_ID +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", product_type='" + product_type + '\'' +
                '}';
    }
    public static class Builder {
        private int product_ID;
        private String product_name, product_description, product_type;

        public Builder setProduct_ID(int product_ID) {
            this.product_ID = product_ID;
            return this;
        }

        public Builder setProduct_name(String product_name) {
            this.product_name = product_name;
            return this;
        }

        public Builder setProduct_description(String product_description) {
            this.product_description = product_description;
            return this;
        }

        public Builder setProduct_type(String product_type) {
            this.product_type = product_type;
            return this;
        }

        public Builder copy(Product product) {
            this.product_ID = product.product_ID;
            this.product_name = product.product_name;
            this.product_description = product.product_description;
            this.product_type = product.product_type;
            return this;
        }

        public Product build() {
            return new Product(this);

        }
    }
}
