<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FoodFiesta</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<header>
    <h1 class="logo">FoodFiesta</h1>
    <nav>
        <a href="index.html">Home</a>
        <a href="categories.html">Categories</a>
        <a href="restaurant.html">Restaurant</a>
        <a href="cart.html">Cart</a>
    </nav>
</header>

<section class="hero">
    <div class="hero-text">
        <h2>Discover Local Cuisines</h2>
        <p>Browse categories, explore dishes, and enjoy your food journey.</p>
        <a href="categories.html" class="btn">Explore Now</a>
    </div>
</section>

<footer>
    <p>© 2025 FoodFiesta | Built for Web Development Practice</p>
</footer>

</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Food Categories</title>
    <link rel="stylesheet" href="css/categories.css">
</head>
<body>

<header>
    <h1>Food Categories</h1>
</header>

<div id="category-list" class="grid"></div>

<script src="js/categories.js"></script>

</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Food Items</title>
    <link rel="stylesheet" href="css/items.css">
</head>
<body>

<header>
    <h1>Food Items</h1>
</header>

<div id="item-list" class="item-grid"></div>

<script src="js/items.js"></script>
<script src="js/cart.js"></script>

</body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Restaurant Details</title>
    <link rel="stylesheet" href="css/restaurant.css">
</head>
<body>

<h1>Restaurant Details</h1>

<div class="restaurant-card">
    <h2>Local Kitchen</h2>
    <p><strong>Rating:</strong> ????? (4.0)</p>
    <p><strong>Cuisine:</strong> Local Favorites</p>
    <p><strong>Address:</strong> Downtown Food Street</p>
    <p><strong>Opening Hours:</strong> 9 AM – 11 PM</p>

    <h3>Top Reviews</h3>
    <ul class="reviews">
        <li>“Amazing taste! Loved the spices.” – ?????</li>
        <li>“Very affordable and delicious.” – ?????</li>
    </ul>
</div>

</body>
</html>

body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background: #fff5e6;
}

header {
    background: #ff6b35;
    color: #fff;
    padding: 15px;
    display: flex;
    justify-content: space-between;
    align-items: center;
}

nav a {
    color: white;
    text-decoration: none;
    margin-left: 20px;
}

.hero {
    background: url('../assets/images/food-banner.jpg') no-repeat center center/cover;
    height: 70vh;
    display: flex;
    align-items: center;
    padding-left: 50px;
}

.hero-text {
    background: rgba(0,0,0,0.5);
    padding: 30px;
    color: white;
    max-width: 400px;
}

.btn {
    padding: 10px 20px;
    background: #ff6b35;
    color: white;
    text-decoration: none;
    border-radius: 5px;
}

body {
    background: #fafafa;
    font-family: Arial;
}

.grid {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 25px;
    padding: 20px;
}

.category-card {
    background: white;
    border-radius: 8px;
    overflow: hidden;
    text-align: center;
    box-shadow: 0 0 10px #ddd;
    cursor: pointer;
}

.category-card img {
    width: 100%;
    height: 200px;
    object-fit: cover;
}

body {
    background: #ffffff;
    font-family: Arial;
}

.item-grid {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 25px;
    padding: 20px;
}

.item-card {
    background: #fff;
    border-radius: 10px;
    padding: 15px;
    box-shadow: 0 0 10px #ddd;
}

button {
    background: #ff6b35;
    color: white;
    padding: 8px 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

body {
    background: #fdf3e6;
    font-family: Arial;
}

.restaurant-card {
    width: 60%;
    margin: auto;
    background: white;
    padding: 20px;
    box-shadow: 0 0 10px #ccc;
    border-radius: 10px;
}

.reviews li {
    background: #fff1cc;
    padding: 10px;
    margin-bottom: 8px;
    border-radius: 6px;
}

const categories = [
    { name: "Rice Dishes", img: "assets/images/rice.jpg" },
    { name: "Soups", img: "assets/images/soup.jpg" },
    { name: "Snacks", img: "assets/images/snacks.jpg" },
    { name: "Grilled Foods", img: "assets/images/grill.jpg" },
    { name: "Drinks", img: "assets/images/drinks.jpg" }
];

const container = document.getElementById("category-list");

categories.forEach(cat => {
    container.innerHTML += `
        <div class="category-card" onclick="openItems('${cat.name}')">
            <img src="${cat.img}" alt="${cat.name}">
            <h3>${cat.name}</h3>
        </div>
    `;
});

function openItems(category) {
    window.location.href = "items.html?category=" + category;
}

const items = [
    { category: "Rice Dishes", name: "Fried Rice", price: 5, discount: "10%", rating: 4 },
    { category: "Rice Dishes", name: "Jollof Rice", price: 6, discount: "5%", rating: 5 },
    { category: "Soups", name: "Pepper Soup", price: 3, discount: "5%", rating: 5 },
    { category: "Snacks", name: "Meat Pie", price: 2, discount: "0%", rating: 4 }
];

const itemDiv = document.getElementById("item-list");
const category = new URLSearchParams(window.location.search).get("category");

const filtered = items.filter(i => i.category === category);

filtered.forEach(i => {
    itemDiv.innerHTML += `
        <div class="item-card">
            <h3>${i.name}</h3>
            <p>Price: $${i.price}</p>
            <p>Discount: ${i.discount}</p>
            <p>Rating: ${"?".repeat(i.rating)}</p>
            <button onclick="addToCart('${i.name}')">Add to Cart</button>
        </div>
    `;
});

