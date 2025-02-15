<!DOCTYPE html>

<html <?php language_attributes();?>>
<head>
    <meta charset="<?php bloginfo('charset'); ?>">
    <!--    This is for mobile devices-->
    <meta name="viewport" content="width=device-width">

    <title><?php bloginfo('name')?></title>
    <?php wp_head();?>
</head>
<body <?php body_class();?>>
<div class="container">
<header class="site-header">
<h1><a href="<?php echo home_url();?>"><?php bloginfo('name')?></a></h1>
    <h5>

        <?php bloginfo('description')?>

        <?php
        if (is_page('contact-us')) {
        ?>
            - Custom contact us page text.
        <?php
        }
        ?>
    </h5>

    <nav class="site-nav">
        <?php

        $args = array(
            'theme_location' => 'primary'
        );

        ?>

        <?php wp_nav_menu($args);?>

    </nav>
</header>


