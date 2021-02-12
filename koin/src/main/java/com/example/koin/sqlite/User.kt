package com.example.koin.sqlite

/**
 * Created by janisharali on 25/12/16.
 */
// Inject Sqlite
class User {
    var id: Long? = null
    var name: String? = null

    constructor() {}
    constructor(name: String?) {
        this.name = name
    }

    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'
    }
}