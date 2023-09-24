package com.ahd.graphql.repository;

import com.example.DemoGraphQL.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>
{
}
