/**
 *
 * @author Lonca Paweł S23452
 *
 */

package zad2

import javax.swing.JOptionPane;

static validateAndTransformUserInput(String userInput) {
    def pattern = /^(\p{L}+) = ([0-9]+(\.[0-9]+)?)$/

    def matcher = userInput =~ pattern
    if (matcher) return new Tuple2<>(true, new Tuple2<>(matcher[0][1].toString(), Double.valueOf(matcher[0][2])))
    else return new Tuple2<>(false, null)
}

def productsSummary = [:]
while (true) {
    String productPrice = JOptionPane.showInputDialog("Specify a product and its price. \nClick OK to add an entry, click Cancel to get a summary.")
    def parsedInput = validateAndTransformUserInput(productPrice)
    if (parsedInput[0]) {
        def productName = parsedInput[1][0]
        productsSummary[productName] = productsSummary.get(productName, 0) + parsedInput[1][1]
    }
    if (productPrice == null) {
        println("Making a summary of your products...")
        break
    }
}

productsSummary.sort().eachWithIndex { entry, i -> println "${i + 1}. $entry.key: $entry.value" }