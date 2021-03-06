package nl.lawik.poc.frontend.reactredux.components

import nl.lawik.poc.frontend.reactredux.containers.addTodo
import nl.lawik.poc.frontend.reactredux.containers.visibleTodoList
import react.RBuilder
import react.dom.br
import react.dom.div
import react.dom.h1
import react.router.dom.browserRouter
import react.router.dom.navLink
import react.router.dom.route
import react.router.dom.switch

private const val TODO_LIST_PATH = "/todolist"

fun RBuilder.app() =
    browserRouter {
        switch {
            route("/", exact = true) {
                div {
                    h1 {
                        +"Kotlin React + React-Dom + Redux + React-Redux + React-Router Example"
                    }
                    navLink(TODO_LIST_PATH) {
                        +"Go to todo list"
                    }
                }
            }
            route(TODO_LIST_PATH) {
                div {
                    addTodo {}
                    visibleTodoList {}
                    footer()
                    br {}
                    navLink("/") {
                        +"Go back"
                    }
                }
            }
        }
    }


