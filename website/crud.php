<html>
    <head>
        <title>My Shop</title>
    </head>

    <body>
        <h1>Welcome to my shop</h1>
        <ul>
            <?php
            $json = file_get_contents('http://product-service/');
            $obj = json_decode($json);
            $products = $obj->products;
	    echo "<h1>List 1</h1>";
            foreach ($products as $product) {
                echo "<li>$product</li>";
            }
	    $json = file_get_contents('http://product-service2/');
            $obj = json_decode($json);
	    echo "<h1>List 2</h1>";
            $products = $obj->products2;
            foreach ($products as $product) {
                echo "<li>$product</li>";
            }
            ?>
        </ul>
    </body>
</html>
