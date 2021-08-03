package com.mindtree.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.mall.entity.Admin;
import com.mindtree.mall.entity.Customer;
import com.mindtree.mall.entity.Product;
import com.mindtree.mall.entity.Purchase;
import com.mindtree.mall.service.AdminService;
import com.mindtree.mall.service.CustomerService;
import com.mindtree.mall.service.ProductService;
import com.mindtree.mall.service.PurchaseService;

@Controller
public class MallController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private PurchaseService purchaseService;
	
	Customer customerObject= new Customer();
	
	Product productObject=new Product();
	
	
	@RequestMapping("/home")
	public String load() {
		return "home";
	}
	
	@RequestMapping("/admin/login")
	public String loginAdminPage() {
		return "loginAsAdmin";
	}
	
	@RequestMapping("/login")
	public String loginUserPage() {
		return "loginAsCustomer";
	}
	
	@RequestMapping("billDetails")
	public String billDetailsAfterPurchase()
	{
		return "CustomerBill";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout";
	}

	@GetMapping("/signInCustomer")
	public String signInUserPage() {
		return "signInAsCustomer";
	}
	
	@GetMapping("/signInAdmin")
	public String signInAdminPage() {
		return "signInAsAdmin";
	}
	@GetMapping("/resetPasswordAdmin")
	public String resetPasswordAdmin() {
		return "passwordResetAdmin";
	}
	@PutMapping("/updatePassword")
	public String updatePassword(String adminName,String password,Model model) {
		Admin admin=adminService.getAdminByName(adminName);
		adminService.updatePassword(admin,password);
		model.addAttribute("admin", admin);
		return "redirect:/getAdminMenu";
	}
	
	@PostMapping("/addAdmin")
	public String signInAdmin(Admin admin) {
		adminService.signInAdmin(admin);
		return "home";
	}
	
	@PostMapping("/addCustomer")
	public String signInCustomer(Customer customer) {
		customerService.signInCustomer(customer);
		return "login";
	}
    
	@RequestMapping("/getAdminMenu")
	public String getMenuAdmin() {
		return "homeAdmin";
	}
	@RequestMapping("/getCustomerMenu")
	public String getMenuCustomer() {
		return "homeCustomer";
	}
	
	@RequestMapping("/manageProducts")
	public String manageProducts() {
		return "manageProduct";
	}
	@RequestMapping("/userList")
	public String userList() {
		return "UserList";
	}
	
	@RequestMapping("/addProducts")
	public String addProducts() {
		return "addProducts";
	}
	
	@GetMapping("/displayPurchaseList")
	public String getAllPurchaseList(Model model)
	{
		List<Purchase> purchases = purchaseService.getAllProducts();
		model.addAttribute("purchases", purchases);
		return "purchaseList";
	}
	
	@GetMapping("/displayProducts")
	public String getAllProducts1(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "productList";
	}
	
	@GetMapping("/displayProductCustomer")
	public String getAllProducts(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "productListCustomer";
	}
	
	@GetMapping("/displayUsers")
	public String getAllCustomers1(Model model) {
		List<Customer> customers = customerService.getAllcustomers();
		model.addAttribute("customers", customers);
		return "UserList";
	}
	
	@GetMapping("/searchByName")
	public String searchByName(String name ,Model model)
	{
		List<Customer> customers= customerService.getCustomerByName(name);
		model.addAttribute("customers",customers );
		return "UserList";
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable int productId, Model model) {
		Product product= productService.getProductById(productId);
		model.addAttribute("product", product);
		productObject=product;
		return "UpdateProducts";
	}
	
	@RequestMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
		return "redirect:/getAdminMenu";
	}
	
	@RequestMapping("/updatedPrice")
	public String update(double price) {
		productService.updatePrice(productObject,price);
		System.out.print(price);
		return "redirect:/getAdminMenu";
	}
	
	@RequestMapping("/insertProduct")
	public String addProducts(Product products)
	{
		productService.insertProducts(products);
		return "redirect:/getAdminMenu";
	}

	@RequestMapping("/buyNow/{productId}")
	public String purchaseProduct(@PathVariable int productId, Model model)
	{
		Product product= productService.getProductById(productId);
		model.addAttribute("product", product);
		productObject=product;
		return "purchaseForm";
	}
	
	@RequestMapping("insertPurchase")
	public String insertPurchaseDetails(String email,Model model)
	{
		int productId=productObject.getProductId();
//		String name=productObject.getName();
//		String catagory=productObject.getCatagory();
//		double price=productObject.getPrice();
		int customerId=customerService.getIdByEmail(email);
		purchaseService.addPurchaseDetails(customerId,productId);
		Product product=productService.getProductById(productId);
		model.addAttribute("product",product);
		
		return "CustomerBill";
	}
}

