package com.wat.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wat.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
