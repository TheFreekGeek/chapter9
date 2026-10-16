Phase 1
This all came together easily. Well covered in class material this week. Use a constructor because it protects access to everything and all info set from the start. Simplifies code and encapsulates better. Once there is a constructor in place you have no choice but to use the constructor.

Phase 2
Pretty straight forward and follows this week's lessons. I got hung up with essenceType showing null but that was because I left out a step in the constructor. You get a compile error if you don't calling the base constructor. This is because with inheritance everything built from that base class needs to conform to all parts. Without completing the constructor for the base, the extended class is not an "Is-A" component.