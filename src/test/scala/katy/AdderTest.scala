package katy

import org.scalatest.FunSpec

class AdderTest extends FunSpec {

  describe("Adder") {
    it("should add 1 and 1") {
      val adder = new Adder
      assert(adder.add(1,1) === 2)
    }

    it("should add 2 and 3") {
      val adder = new Adder
      assert(adder.add(2,3) === 5)
    }
  }

}
