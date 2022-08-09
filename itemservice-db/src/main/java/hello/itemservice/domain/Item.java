package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "Item") //테이블명이 엔티티클래스명이랑 같으면 생략해도됨
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //스프링부트와 통합해서 사용하면 자동으로 카멜<->스네이크 변환이 된다.(따라서 밑의 @Column은 없어도되긴함)
    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;
    
    //기본생성자 필수
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
