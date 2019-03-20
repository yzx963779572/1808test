package com.ssm.model;

/**
 *建表表明不要起关键字 order是关键字
 *
 *
 * CREATE TABLE `orders` (
 *   `oid` int(11) NOT NULL AUTO_INCREMENT,
 *   `oname` varchar(30) NOT NULL,
 *   `price` double(8,0) DEFAULT NULL,
 *   `uid` int(11) DEFAULT NULL,
 *   PRIMARY KEY (`oid`,`oname`) USING BTREE
 * ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
 */
public class Oreders {
    private  Integer oid;
    private String oname;
    private Double price;
    private Integer uid;



    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Oreders{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", price=" + price +
                ", uid=" + uid +
                '}';
    }
}
