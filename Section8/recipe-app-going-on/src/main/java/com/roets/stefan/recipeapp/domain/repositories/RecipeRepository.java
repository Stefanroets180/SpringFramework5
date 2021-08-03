package com.roets.stefan.recipeapp.domain.repositories;

import com.roets.stefan.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
