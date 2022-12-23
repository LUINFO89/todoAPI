package com.coex.app.rest.Repository;

import com.coex.app.rest.Model.Task1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task1, Long> {

}
