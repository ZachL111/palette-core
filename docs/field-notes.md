# Field Notes

`palette-core` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `geometry span`, `atlas pressure`, `shader drift`, and `render budget`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

The widest spread is between `render budget` and `shader drift`, so those are the first two cases I would preserve during a refactor.

The point is not to make the repository bigger. The point is to make the important judgment testable.
