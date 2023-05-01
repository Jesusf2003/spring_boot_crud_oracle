package com.spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "client")
public class ClientM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcli")
	private Long idcli;
	
	@Column(name = "namecli")
	private String namecli;
	
	@Column(name = "apecli")
	private String apecli;
	
	@Column(name = "cellcli")
	private String cellcli;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "userpswd")
	private String userpswd;
}