package example

import grails.plugin.json.builder.JsonOutput.JsonWritable
import grails.plugin.json.view.JsonViewWritableScript

abstract class BaseJsonView extends JsonViewWritableScript {

    String doSomething() {
        return "foo"
    }

    JsonWritable doAnother() {
        g.render(template: '/person/otherView')
    }
}
