package features


import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Then(~/^el registro se completa cuando aparece el Boton Complete Setup$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}