package at.htl.todo.model;

import javax.inject.Inject;
import javax.inject.Singleton;

import at.htl.todo.util.store.Store;

/** This is our Storage area for <a href="https://redux.js.org/understanding/thinking-in-redux/three-principles">single source of truth</a> {@link Model}. */
@Singleton
public class ModelStore extends Store<Model> {
    @Inject
    ModelStore() {
        super(Model.class, new Model());
    }
    public void setTodos(Todo[] todos) {
        apply(model -> model.todos = todos);
    }
}

