package cipherdogs

import org.scalajs.dom
import org.scalajs.dom.document

object Hello {
  def main(args: Array[String]): Unit = {
    appendPar(document.body, "Hello World from Scala.js")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }
}
