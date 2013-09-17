# Scalatest tagging example
This example demonstrates how easy it is to tag tests for ignoring with annotations. Examples use SBT 0.13 and Scalatest 2.0.

Quick Info
---

1. Run sbt
2. Try to execute tests using `test` command. You should see output showing that 'before all' and 'after all' blocks
ran, as well as standard test output.
3. Now try `test-only * -- -l tags.RequiresDb`. You should see only output from the untagged test.