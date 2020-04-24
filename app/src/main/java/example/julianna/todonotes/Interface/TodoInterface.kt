package example.julianna.todonotes.Interface

import io.realm.Realm
import example.julianna.todonotes.Model.Todo

interface TodoInterface {

    fun addTodo(realm: Realm, todo: Todo):Boolean
    fun deleteTodo(realm: Realm,id: Int):Boolean
    fun updateTodo(realm: Realm, todo: Todo):Boolean


}