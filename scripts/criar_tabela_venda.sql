

CREATE TABLE venda (
   id INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
   dataVenda DATE,
   idCliente int,
   idProduto int,
   qte int,
   preco double   
);
