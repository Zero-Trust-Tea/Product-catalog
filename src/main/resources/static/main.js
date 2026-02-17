(function show_products_list() {
    const show_products_btn = document.getElementById('showProducts');
    const products_list = document.getElementById('products');
    show_products_btn.addEventListener('click', () => {
        products_list.style.display = products_list.style.display === 'none' ? 'block' : 'none';
    });
})();

(function add_product_interface_toggler() {
    document.getElementById('addProductBtn').addEventListener('click', function () {
        const elements = document.querySelectorAll('.addProductInner');
        elements.forEach(function (el) {
            const style = window.getComputedStyle(el);
            el.style.display = style.display === 'none' ? 'flex' : 'none';
        })
    })
})();

(function remove_products_interface_toggler() {
    const removeBtn = document.getElementById('removeProductBtn');
    removeBtn.addEventListener('click', () => {
        const elements = document.querySelectorAll('.removeProductInner');
        elements.forEach((el) => {
            const style = window.getComputedStyle(el);
            el.style.display = style.display === 'none' ? 'flex' : 'none';
        })
    })
})();
