## Team code conventions

### VCS `Git`
#### Branches
Every branch creates for one task. Branch name should match with Trello card title.

#### Commit message
Every commit message should contain a team member name in left part and short list of changes in Present Simple Time with 10 work limit, in right part. Use `|` as a divider.

Template :  `@teamMemberName | short list of changes in Present Simple Time`

Example : `@yamnyk | add code conventions .md file`

### HTML
Use HTML5 tags:
 * `<header></header>` - to mark the head of page or section.
 * `<footer></footer>` - to mark the bottom element of page or section.
 * `<section></section>` - to mark sections.
 * `<menu></menu>` - for creating menu/navbar. This tag expects `<li></li>` inside of itself. So it's basically semantic rename for tag `<ul></ul>`. 

### Styles
#### Units
Use **`rem`** as main unit for all dimensions in project. Basic `font-size` in html replaced to `10px` for comfort calculations.
##### Use SCSS preprocessor and its syntax benefits
Some constructions you must use for sure:
```scss
.block {
    &__title {
        &::before{
        
        }
    }
}
```



#### Class names
Use BEM conventions for create class names for CSS. responsible for correctness checking ---> `@fs1.yuri.pod` in Slack.

### React components
**Use ES6/ES7 syntax** for your components code. It meats: *JS classes*, *destructurisation*, *spread*, *arrow functions*, *default values* for function parameters, etc.

**Functional components** have no `state` and contains all styles for children components.

**Variables** names - use camelCase for several words in name and define **only informative** ones.

###### no `var`, only `let` and `const`
