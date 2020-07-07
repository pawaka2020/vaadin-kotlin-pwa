package com.vaadin.pwademo
import com.vaadin.flow.component.UI
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.html.Label
import com.vaadin.flow.component.html.Span
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.component.tabs.Tab
import com.vaadin.flow.component.tabs.Tabs
import com.vaadin.flow.router.Route
import com.vaadin.flow.router.RouterLink


@Route("second")
class MainView2 : VerticalLayout() {
    init { // HEADER
        val drawer: Icon = VaadinIcon.MENU.create()
        val title = Span("My application")
        val help: Icon = VaadinIcon.QUESTION_CIRCLE.create()
        val header = HorizontalLayout(drawer, title, help)
        header.expand(title)
        header.isPadding = true
        header.width = "100%"
        // WORKSPACE
        val workspace = VerticalLayout()
        workspace.setSizeFull()
        // FOOTER
        val actionButton1 = Tab(VaadinIcon.HOME.create(), Span("Home"))
        val actionButton2 = Tab(VaadinIcon.USERS.create(), Span("Customers"))
        val actionButton3 = Tab(VaadinIcon.PACKAGE.create(), Span("Products"))
        val buttonBar = Tabs(actionButton1, actionButton2, actionButton3)
        val footer = HorizontalLayout(buttonBar)
        footer.justifyContentMode = JustifyContentMode.CENTER
        footer.width = "100%"
        // MAIN CONTAINER
        setSizeFull()
        isMargin = false
        isSpacing = false
        isPadding = false
        add(header, workspace, footer)
    }
}

@Route("")
class MainView: VerticalLayout(){
    val button = Button("Click me")
//    val link = RouterLink("second", MainView2::class.java).apply{
//        element.appendChild(button.element)
//    }





//    fun routerLink() {
//        val menu = Div()
//        menu.add(RouterLink("Home", HomeView::class.java))
//        menu.add(RouterLink("Greeting", GreetingComponent::class.java, "default"))
//    }


    init{
        for (i in 0 until 5){
            val text1 = Label("Hello")

            val holder = HorizontalLayout().apply{
                add(text1)
                setSizeFull()
                justifyContentMode = JustifyContentMode.CENTER
            }

            add(holder)
        }
        //add(link)

    }
}