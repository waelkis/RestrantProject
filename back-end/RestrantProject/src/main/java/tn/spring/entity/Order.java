package tn.spring.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="order_name")
	private String name;
	
	@Column(name="price")
	private  int price;
	@Column(name="img")
	private String img;
	@Column(name="discription")
	@Lob
    private String discription;
	
	
	@JsonIgnore
	  @ManyToOne
	  
	  @JoinColumn(name="id_category")
	  private Category category;
	 
	  @Column(name="date_creat")
		@CreationTimestamp
		private Date dateCreat;
		@Column(name="date_update")
		@UpdateTimestamp
		private Date dateUpdate;

}
