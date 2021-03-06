package com.hamadaintranet.entity;
// Generated Oct 13, 2020 10:20:22 AM by Hibernate Tools 5.2.10.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Products generated by hbm2java
 */
@Entity
@Table(name = "products", catalog = "hamadadb", uniqueConstraints = { @UniqueConstraint(columnNames = "prod_barcode"),
		@UniqueConstraint(columnNames = "prod_name") })
public class Products implements java.io.Serializable {

	private long prodId;
	private Categories categories;
	private Date prodDateEntrance;
	private String prodName;
	private long prodBarcode;
	private String prodType;
	private String prodSize;
	private Integer prodQty;
	private BigDecimal prodWeight;
	private Date prodDateValidity;
	private Date prodDateValidityvenc;
	private String prodDescription;
	private int prodStock;
	private BigDecimal prodBuyPrice;
	private BigDecimal prodSellPrice;
	private byte[] prodImage;
	private Long supplierId;
	private Set<Reviews> reviewses = new HashSet<Reviews>(0);
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public Products() {
	}

	public Products(long prodId, Categories categories, Date prodDateEntrance, String prodName, long prodBarcode,
			String prodType, String prodSize, Date prodDateValidity, Date prodDateValidityvenc, int prodStock,
			BigDecimal prodBuyPrice, BigDecimal prodSellPrice, byte[] prodImage) {
		this.prodId = prodId;
		this.categories = categories;
		this.prodDateEntrance = prodDateEntrance;
		this.prodName = prodName;
		this.prodBarcode = prodBarcode;
		this.prodType = prodType;
		this.prodSize = prodSize;
		this.prodDateValidity = prodDateValidity;
		this.prodDateValidityvenc = prodDateValidityvenc;
		this.prodStock = prodStock;
		this.prodBuyPrice = prodBuyPrice;
		this.prodSellPrice = prodSellPrice;
		this.prodImage = prodImage;
	}

	public Products(long prodId, Categories categories, Date prodDateEntrance, String prodName, long prodBarcode,
			String prodType, String prodSize, Integer prodQty, BigDecimal prodWeight, Date prodDateValidity,
			Date prodDateValidityvenc, String prodDescription, int prodStock, BigDecimal prodBuyPrice,
			BigDecimal prodSellPrice, byte[] prodImage, Long supplierId, Set<Reviews> reviewses,
			Set<OrderDetail> orderDetails) {
		this.prodId = prodId;
		this.categories = categories;
		this.prodDateEntrance = prodDateEntrance;
		this.prodName = prodName;
		this.prodBarcode = prodBarcode;
		this.prodType = prodType;
		this.prodSize = prodSize;
		this.prodQty = prodQty;
		this.prodWeight = prodWeight;
		this.prodDateValidity = prodDateValidity;
		this.prodDateValidityvenc = prodDateValidityvenc;
		this.prodDescription = prodDescription;
		this.prodStock = prodStock;
		this.prodBuyPrice = prodBuyPrice;
		this.prodSellPrice = prodSellPrice;
		this.prodImage = prodImage;
		this.supplierId = supplierId;
		this.reviewses = reviewses;
		this.orderDetails = orderDetails;
	}

	@Id

	@Column(name = "prod_id", unique = true, nullable = false)
	public long getProdId() {
		return this.prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryID", nullable = false)
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "prod_date_entrance", nullable = false, length = 10)
	public Date getProdDateEntrance() {
		return this.prodDateEntrance;
	}

	public void setProdDateEntrance(Date prodDateEntrance) {
		this.prodDateEntrance = prodDateEntrance;
	}

	@Column(name = "prod_name", unique = true, nullable = false, length = 90)
	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	@Column(name = "prod_barcode", unique = true, nullable = false)
	public long getProdBarcode() {
		return this.prodBarcode;
	}

	public void setProdBarcode(long prodBarcode) {
		this.prodBarcode = prodBarcode;
	}

	@Column(name = "prod_type", nullable = false, length = 40)
	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	@Column(name = "prod_size", nullable = false, length = 30)
	public String getProdSize() {
		return this.prodSize;
	}

	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}

	@Column(name = "prod_qty")
	public Integer getProdQty() {
		return this.prodQty;
	}

	public void setProdQty(Integer prodQty) {
		this.prodQty = prodQty;
	}

	@Column(name = "prod_weight", precision = 13, scale = 4)
	public BigDecimal getProdWeight() {
		return this.prodWeight;
	}

	public void setProdWeight(BigDecimal prodWeight) {
		this.prodWeight = prodWeight;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "prod_date_validity", nullable = false, length = 10)
	public Date getProdDateValidity() {
		return this.prodDateValidity;
	}

	public void setProdDateValidity(Date prodDateValidity) {
		this.prodDateValidity = prodDateValidity;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "prod_date_validityvenc", nullable = false, length = 10)
	public Date getProdDateValidityvenc() {
		return this.prodDateValidityvenc;
	}

	public void setProdDateValidityvenc(Date prodDateValidityvenc) {
		this.prodDateValidityvenc = prodDateValidityvenc;
	}

	@Column(name = "prod_description", length = 65535)
	public String getProdDescription() {
		return this.prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	@Column(name = "prod_stock", nullable = false)
	public int getProdStock() {
		return this.prodStock;
	}

	public void setProdStock(int prodStock) {
		this.prodStock = prodStock;
	}

	@Column(name = "prod_buy_price", nullable = false, precision = 13)
	public BigDecimal getProdBuyPrice() {
		return this.prodBuyPrice;
	}

	public void setProdBuyPrice(BigDecimal prodBuyPrice) {
		this.prodBuyPrice = prodBuyPrice;
	}

	@Column(name = "prod_sell_price", nullable = false, precision = 13)
	public BigDecimal getProdSellPrice() {
		return this.prodSellPrice;
	}

	public void setProdSellPrice(BigDecimal prodSellPrice) {
		this.prodSellPrice = prodSellPrice;
	}

	@Column(name = "prod_image", nullable = false)
	public byte[] getProdImage() {
		return this.prodImage;
	}

	public void setProdImage(byte[] prodImage) {
		this.prodImage = prodImage;
	}

	@Column(name = "supplierID")
	public Long getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<Reviews> getReviewses() {
		return this.reviewses;
	}

	public void setReviewses(Set<Reviews> reviewses) {
		this.reviewses = reviewses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
