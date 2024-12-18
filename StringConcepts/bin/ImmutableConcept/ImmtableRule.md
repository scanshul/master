Immutable Rule:
Declare the class as final to prevent subclassing.
Mark all fields as private and final so their values cannot be modified after initialization.
Do not provide setters for the fields.
Initialize fields via a constructor only.
Perform deep copying of mutable fields to prevent external modifications.
Ensure methods do not expose references to mutable objects.