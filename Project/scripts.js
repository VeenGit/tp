document.addEventListener("DOMContentLoaded", () => {
    // Contact Form Validation
    const contactForm = document.querySelector("#contact form");
    if (contactForm) {
        contactForm.addEventListener("submit", function (event) {
            event.preventDefault(); // Prevent form submission for validation checks

            let isValid = true;

            // Name Validation
            const name = document.getElementById("name");
            if (name.value.trim() === "") {
                alert("Name is required.");
                isValid = false;
            }

            // Email Validation
            const email = document.getElementById("email");
            if (!validateEmail(email.value)) {
                alert("Please enter a valid email address.");
                isValid = false;
            }

            // Message Validation
            const message = document.getElementById("message");
            if (message.value.trim() === "") {
                alert("Message is required.");
                isValid = false;
            }

            if (isValid) {
                alert("Thank you for contacting us!");
                contactForm.submit();
            }
        });
    }

    // Sign Up / Sign In Validation
    const signupForm = document.querySelector("#signup form");
    if (signupForm) {
        signupForm.addEventListener("submit", function (event) {
            event.preventDefault();

            let isValid = true;

            // Username Validation
            const username = document.getElementById("username");
            if (username.value.trim() === "") {
                alert("Username is required.");
                isValid = false;
            }

            // Password Validation
            const password = document.getElementById("password");
            if (password.value.length < 6) {
                alert("Password must be at least 6 characters long.");
                isValid = false;
            }

            if (isValid) {
                alert("Successfully signed in!");
                signupForm.submit();
            }
        });
    }

    // Navbar Toggle Enhancement
    const navToggle = document.getElementById("nav-toggle");
    if (navToggle) {
        navToggle.addEventListener("click", function () {
            const links = document.getElementById("navbarNav");
            links.classList.toggle("show");
        });
    }

    // Add interactivity to Meal Planner Table
    const table = document.querySelector("#meal-planner table");
    if (table) {
        table.addEventListener("click", function (event) {
            if (event.target.tagName === "TD" && event.target.cellIndex !== 0) {
                const cell = event.target;

                // Toggle between "Planned" and the original text (only for meal cells, not the day column)
                if (cell.textContent === "Planned") {
                    cell.textContent = "Placeholder Meal";
                    cell.classList.remove("planned");
                } else {
                    cell.textContent = "Planned";
                    cell.classList.add("planned");
                }
            }
        });
    } else {
        console.error("Meal Planner table not found.");
    }

    // Recipe CRUD Operations
    const recipeForm = document.getElementById("recipe-form");
    const recipeList = document.getElementById("recipe-list");

    // Load existing recipes from localStorage
    loadRecipes();

    // Handle form submission to create a new recipe
    recipeForm.addEventListener("submit", function (event) {
        event.preventDefault();
        const name = document.getElementById("recipe-name").value.trim();
        const ingredients = document.getElementById("recipe-ingredients").value.trim();
        const steps = document.getElementById("recipe-steps").value.trim();

        if (name && ingredients && steps) {
            const recipe = {
                id: Date.now(), // Unique ID for each recipe
                name: name,
                ingredients: ingredients,
                steps: steps
            };

            saveRecipe(recipe);
            addRecipeToList(recipe);
            recipeForm.reset();
        }
    });

    // Save recipe to localStorage
    function saveRecipe(recipe) {
        let recipes = getRecipes();
        recipes.push(recipe);
        localStorage.setItem("recipes", JSON.stringify(recipes));
    }

    // Load recipes from localStorage and display them
    function loadRecipes() {
        const recipes = getRecipes();
        recipes.forEach(recipe => addRecipeToList(recipe));
    }

    // Get recipes from localStorage
    function getRecipes() {
        const recipes = localStorage.getItem("recipes");
        return recipes ? JSON.parse(recipes) : [];
    }

    // Add recipe to the UI list
    function addRecipeToList(recipe) {
        const li = document.createElement("li");
        li.classList.add("list-group-item");
        li.setAttribute("data-id", recipe.id);
        li.innerHTML = `
            <strong>${recipe.name}</strong>
            <p>Ingredients: ${recipe.ingredients}</p>
            <p>Steps: ${recipe.steps}</p>
            <button class="btn btn-warning btn-sm mr-2" onclick="editRecipe(${recipe.id})">Edit</button>
            <button class="btn btn-danger btn-sm" onclick="deleteRecipe(${recipe.id})">Delete</button>
        `;
        recipeList.appendChild(li);
    }

    // Edit a recipe
    window.editRecipe = function (id) {
        const recipes = getRecipes();
        const recipe = recipes.find(r => r.id === id);
        if (recipe) {
            document.getElementById("recipe-name").value = recipe.name;
            document.getElementById("recipe-ingredients").value = recipe.ingredients;
            document.getElementById("recipe-steps").value = recipe.steps;

            // Remove the recipe temporarily for update
            deleteRecipe(id, false);
        }
    };

    // Delete a recipe
    window.deleteRecipe = function (id, updateUI = true) {
        let recipes = getRecipes();
        recipes = recipes.filter(recipe => recipe.id !== id);
        localStorage.setItem("recipes", JSON.stringify(recipes));
        if (updateUI) {
            const recipeItem = document.querySelector(`[data-id="${id}"]`);
            if (recipeItem) {
                recipeList.removeChild(recipeItem);
            }
        }
    };
});

// Helper Function to Validate Email Format
function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
}
