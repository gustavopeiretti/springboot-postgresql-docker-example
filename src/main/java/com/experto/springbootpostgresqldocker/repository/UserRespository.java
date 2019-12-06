package com.experto.springbootpostgresqldocker.repository;

import com.experto.springbootpostgresqldocker.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<UserModel, Long> {
}
